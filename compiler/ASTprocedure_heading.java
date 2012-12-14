/* Generated By:JJTree: Do not edit this line. ASTprocedure_heading.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;

public
class ASTprocedure_heading extends SimpleNode {
  public ASTprocedure_heading(int id) {
    super(id);
  }

  public ASTprocedure_heading(Pascal p, int id) {
    super(p, id);
  }

  public Object generateCode(GeneratorContext gc) throws GenerateException{
	  if (children!=null && children.length>0) {
		  if (children[0]!=null && children[0] instanceof ASTidentifier) {
			  if (gc.currentProcedureOrFunction!=null) {
				  gc.currentProcedureOrFunction.name=((ASTidentifier)children[0]).getName();
				  if (children.length>1) {
					  if (children[1]!=null && children[1] instanceof ASTformal_parameter_list) {
						  ((ASTformal_parameter_list)children[1]).generateCode(gc);
					  }
				  }
				  return null;
			  }
		  }
	  }
	  throw new GenerateException("Something Very Bad!\n");
  }
}
/* JavaCC - OriginalChecksum=2000b64b32b346b0a33476a42c73901f (do not edit this line) */