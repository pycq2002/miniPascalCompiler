/* Generated By:JJTree: Do not edit this line. ASTactual_parameter.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import java.util.ArrayList;

import codeGenerator.Component;
import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;
import codeGenerator.Type;

public
class ASTactual_parameter extends SimpleNode {
  public ASTactual_parameter(int id) {
    super(id);
  }

  public ASTactual_parameter(Pascal p, int id) {
    super(p, id);
  }

  public void addParameter(GeneratorContext gc,ArrayList<Type> ac) throws GenerateException {
	  if (children!=null && children.length==1) {
		  if (children[0]!=null && children[0] instanceof ASTvariable) {
			  ac.add(((ASTvariable)children[0]).getType(gc));
			  return;
		  }
		  if (children[0]!=null && children[0] instanceof ASTexpression) {
			  ac.add(((ASTexpression)children[0]).getType(gc));
			  return;
		  }
		  throw new GenerateException("Something Very Bad!\n");
	  }
	  throw new GenerateException("Something Very Bad!\n");
  }
}
/* JavaCC - OriginalChecksum=ef924997a61ffb8bab482811742ce31b (do not edit this line) */
