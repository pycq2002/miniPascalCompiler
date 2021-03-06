/* Generated By:JJTree: Do not edit this line. ASTterm.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;
import codeGenerator.Register;
import codeGenerator.Type;

public
class ASTterm extends SimpleNode {
  public ASTterm(int id) {
    super(id);
  }

  public ASTterm(Pascal p, int id) {
    super(p, id);
  }
  
  
  public Register generateCode(GeneratorContext gc) throws GenerateException{
	  getType(gc);
	  if (gc.generate) {
		  if (children!=null && children.length==1) {
			  if (children[0]!=null && children[0] instanceof ASTfactor) {
				  return ((ASTfactor)children[0]).generateCode(gc);
			  }
			  if (children[0]!=null && children[0] instanceof ASTMultiplicationNode) {
				  return ((ASTMultiplicationNode)children[0]).generateCode(gc);
			  }
			  throw new GenerateException("Something Very Bad!\n");
		  }
	  } else {
		  simpleGenerate(gc);
	  }
	  throw new GenerateException("Something Very Bad!\n");
  }
  public Type getType(GeneratorContext gc) throws GenerateException{
	  if (children!=null && children.length==1) {
		  if (children[0]!=null && children[0] instanceof ASTfactor) {
			  return ((ASTfactor)children[0]).getType(gc);
		  }
		  if (children[0]!=null && children[0] instanceof ASTMultiplicationNode) {
			  return ((ASTMultiplicationNode)children[0]).getType(gc);
		  }
		  throw new GenerateException("Something Very Bad!\n");
	  }
	  throw new GenerateException("Something Very Bad!\n");
  }

}
/* JavaCC - OriginalChecksum=89b055df88708953f71ca32f99e640d4 (do not edit this line) */
