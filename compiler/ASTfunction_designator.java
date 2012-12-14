/* Generated By:JJTree: Do not edit this line. ASTfunction_designator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import java.util.ArrayList;

import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;
import codeGenerator.Type;

public
class ASTfunction_designator extends SimpleNode {
  public ASTfunction_designator(int id) {
    super(id);
  }

  public ASTfunction_designator(Pascal p, int id) {
    super(p, id);
  }
  
  public Object generateCode(GeneratorContext gc) throws GenerateException{//return variable type
	  if (children!=null && children.length>0) {
		  if (children[0]!=null && children[0] instanceof ASTidentifier) {
			  Token functionToken=((ASTidentifier)children[0]).getToken();
			  if (gc.globalFunctionMap.containsKey(functionToken.image)) {
				  //TODO:Right
			  } else {
				  throw new GenerateException(String.format("No such Function '%s'!",functionToken.image),functionToken);
			  }
			  if (children.length>1) {
				  if (children[1]!=null && children[1] instanceof ASTactual_parameter_list) {
					  ArrayList<Type> at=((ASTactual_parameter_list)children[1]).getParameterList(gc);
					  if (!gc.globalFunctionMap.get(functionToken.image).checkParameter(at)) {
						  throw new GenerateException("Parameter Type Error!\n",functionToken);
					  }
				  }
			  } else {
				  if (!gc.globalFunctionMap.get(functionToken.image).checkParameter(new ArrayList<Type>())) {
					  throw new GenerateException("Parameter Type Error!\n",functionToken);
				  }
			  }
			  } else {
				  throw new GenerateException("Something Very Bad!\n");
			  }
	  }
	  throw new GenerateException("Something Very Bad!\n");
  }
  
  public Type getType(GeneratorContext gc) throws GenerateException{
	  if (children!=null && children.length>0 && children[0]!=null && children[0] instanceof ASTidentifier) {
		  ASTidentifier aif=(ASTidentifier) children[0];
		  Token tt=aif.getToken();
		  if (gc.globalFunctionMap.containsKey(tt.image)) {
			  return gc.globalFunctionMap.get(tt.image).resultType;
		  } else {
			  throw new GenerateException(String.format("No Such Function '%s'!",tt.image),tt);
		  }
	  }
	  throw new GenerateException("Something Very Bad!\n");
  }

}
/* JavaCC - OriginalChecksum=e38c29b33dd5332502ab135768eab6ba (do not edit this line) */
