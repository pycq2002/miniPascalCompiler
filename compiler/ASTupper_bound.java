/* Generated By:JJTree: Do not edit this line. ASTupper_bound.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import codeGenerator.GeneratorContext;

public
class ASTupper_bound extends SimpleNode {
	private int num;
	private Token numtoken;
  public ASTupper_bound(int id) {
    super(id);
  }

  public ASTupper_bound(Pascal p, int id) {
    super(p, id);
  }
  public void setToken(Token n) {
	  numtoken=n;
	  num=Integer.parseInt(n.image);
  }
  public int getInt() {
	  return num;
  }
  
  public Token getToken() {
	  return numtoken;
  }
  
  public Object generateCode(GeneratorContext gc) {
	  if (children!=null) {
		  for (int i=0;i<children.length;++i) {
			  SimpleNode n=(SimpleNode)children[i];
			  if (n!=null && n instanceof ASTsign) {
				  String sign=((ASTsign)n).getSign();
				  if (sign.equals("-")) {
					  num=-num;
				  }
			  }
		  }
	  }
	  return null;
  }

}
/* JavaCC - OriginalChecksum=d299144f88971fb726a22e794cef02b2 (do not edit this line) */
