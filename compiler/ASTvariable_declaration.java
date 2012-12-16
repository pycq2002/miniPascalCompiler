/* Generated By:JJTree: Do not edit this line. ASTvariable_declaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import codeGenerator.Component;
import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;
import codeGenerator.Type;
import codeGenerator.Variable;

public
class ASTvariable_declaration extends SimpleNode {
  public ASTvariable_declaration(int id) {
    super(id);
  }

  public ASTvariable_declaration(Pascal p, int id) {
    super(p, id);
  }
  
  public Object generateCode(GeneratorContext gc) throws GenerateException{
	  if (gc.currentProcedureOrFunction!=null) {
		  if (children!=null && children.length==2)
			  if (children[0]!=null && children[0] instanceof ASTidentifier_list)
				  if (children[1]!=null && children[1] instanceof ASTtype) {
					  Type type=(Type)((ASTtype)children[1]).generateCode(gc);
					  ASTidentifier_list ail=(ASTidentifier_list)children[0];
					  if (ail.children!=null)
						  for (int i=0;i<ail.children.length;++i) {
							  if (ail.children[i]!=null && ail.children[i] instanceof ASTidentifier) {
								  ASTidentifier tmp=(ASTidentifier)ail.children[i];
								  Component tc=new Component(tmp.getName(),type);
								  if (!gc.currentProcedureOrFunction.addLocalVariable(tc)) {
									  throw new GenerateException(String.format("Duplicate definition of variable '%s'!\nLine %d,Column %d",
											  tmp.getName(),tmp.getToken().beginLine,tmp.getToken().beginColumn));
								  }
							  }
						  }
					  return null;
				  }
		  throw new GenerateException("Something Very Bad!\n");
	  } else {
		  if (children!=null && children.length==2)
			  if (children[0]!=null && children[0] instanceof ASTidentifier_list)
				  if (children[1]!=null && children[1] instanceof ASTtype) {
					  Type type=(Type)((ASTtype)children[1]).generateCode(gc);
					  ASTidentifier_list ail=(ASTidentifier_list)children[0];
					  if (ail.children!=null)
						  for (int i=0;i<ail.children.length;++i) {
							  if (ail.children[i]!=null && ail.children[i] instanceof ASTidentifier) {
								  ASTidentifier tmp=(ASTidentifier)ail.children[i];
								  Variable tc=new Variable(tmp.getName(),type);
								  if (gc.generate)
									  gc.code.append(String.format("%s rq %d\n", tc.name,type.getTypeSize()));
								  if (!gc.addGlobalVariable(tc)) {
									  throw new GenerateException(String.format("Duplicate definition of variable '%s'!\nLine %d,Column %d",
											  tmp.getName(),tmp.getToken().beginLine,tmp.getToken().beginColumn));
								  }
							  }
						  }
					  return null;
				  }
		  throw new GenerateException("Something Very Bad!\n");
	  }
  }

}
/* JavaCC - OriginalChecksum=79c2fd5b584c3f25d79d9d3f34a8645c (do not edit this line) */
