/* Generated By:JJTree: Do not edit this line. ASTfield_list.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;
import codeGenerator.RecordType;

public
class ASTfield_list extends SimpleNode {
  public ASTfield_list(int id) {
    super(id);
  }

  public ASTfield_list(Pascal p, int id) {
    super(p, id);
  }
  
  public void completeRecord(GeneratorContext gc,RecordType rt) throws GenerateException{
	  if (children!=null) {
		  for (int i=0;i<children.length;++i) {
			  SimpleNode n=(SimpleNode)children[i];
			  if (n!=null && n instanceof ASTrecord_section) {
				  ((ASTrecord_section)n).completeRecord(gc,rt);
			  }
		  }
	  }
  }

}
/* JavaCC - OriginalChecksum=7cdbc17d6fd84411682d71a478414d0f (do not edit this line) */
