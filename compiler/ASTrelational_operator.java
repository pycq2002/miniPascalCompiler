/* Generated By:JJTree: Do not edit this line. ASTrelational_operator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

public
class ASTrelational_operator extends SimpleNode {
	private String opt="";
  public ASTrelational_operator(int id) {
    super(id);
  }

  public ASTrelational_operator(Pascal p, int id) {
    super(p, id);
  }
  public void setOpt(String o) {
	  opt=o;
  }
  public String getOpt() {
	  return opt;
  }
  public String toString() { return "relational_operator \"" + opt+"\"";}
}
/* JavaCC - OriginalChecksum=420e23125a0f136b1cdaa6a5d264a65c (do not edit this line) */
