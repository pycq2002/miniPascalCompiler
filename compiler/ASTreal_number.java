/* Generated By:JJTree: Do not edit this line. ASTreal_number.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

public
class ASTreal_number extends SimpleNode {
	private String num;
  public ASTreal_number(int id) {
    super(id);
  }

  public ASTreal_number(Pascal p, int id) {
    super(p, id);
  }
  public void setNum(String n) {
	  num=n;
  }
  
  public String toString() { return "<Real>: "+num; }
}
/* JavaCC - OriginalChecksum=5870cb2be068866e673ddeb1c8428866 (do not edit this line) */
