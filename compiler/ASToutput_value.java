/* Generated By:JJTree: Do not edit this line. ASToutput_value.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;
import codeGenerator.Register;

public
class ASToutput_value extends SimpleNode {
  public ASToutput_value(int id) {
    super(id);
  }

  public ASToutput_value(Pascal p, int id) {
    super(p, id);
  }
  public Object generateCode(GeneratorContext gc) throws GenerateException{
	  if (children!=null && children.length==1 && children[0]!=null && children[0] instanceof ASTexpression) {
		  if (gc.generate) {
			  Register rg=((ASTexpression)children[0]).generateCode(gc);
			  gc.code.append(String.format("mov [%s],%s\n",gc.getIOBuf(),rg.getLowByte()));
			  rg.release();
			  gc.code.append("mov rax,4   ;write\n");
			  gc.code.append("mov rbx,1   ;stdout\n");
			  gc.code.append(String.format("mov rcx,%s\n",gc.getIOBuf()));
			  gc.code.append("mov rdx,1   ;len\n");
			  gc.code.append("int 0x80    ;syscall\n");
		  } else {
			  simpleGenerate(gc);
		  }
	  } else {
		  throw new GenerateException("Something Very Bad!\n");
	  }
	  return null;
  }

}
/* JavaCC - OriginalChecksum=49c8668da7759273353b3a7b80724cb4 (do not edit this line) */
