/* Generated By:JJTree: Do not edit this line. ASTMultiplicationNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package compiler;

import codeGenerator.ArrayType;
import codeGenerator.GenerateException;
import codeGenerator.GeneratorContext;
import codeGenerator.IntegerType;
import codeGenerator.RealType;
import codeGenerator.RecordType;
import codeGenerator.Register;
import codeGenerator.Type;

public
class ASTMultiplicationNode extends SimpleNode {
  public ASTMultiplicationNode(int id) {
    super(id);
  }

  public ASTMultiplicationNode(Pascal p, int id) {
    super(p, id);
  }
  public Register generateCode(GeneratorContext gc) throws GenerateException{
	  getType(gc);
	  if (gc.generate) {
		  if (children!=null && children.length==3) {
			  Register rg1=null,rg2=null;
			  if (children[0]!=null && children[0] instanceof ASTMultiplicationNode) {
				  rg1=((ASTMultiplicationNode)children[0]).generateCode(gc);
				  gc.code.append(String.format("push %s\n",rg1));
				  rg1.release();
			  }
			  if (children[0]!=null && children[0] instanceof ASTfactor) {
				  rg1=((ASTfactor)children[0]).generateCode(gc);
				  gc.code.append(String.format("push %s\n",rg1));
				  rg1.release();
			  }
			  if (children[2]!=null && children[2] instanceof ASTfactor) {
				  rg2=((ASTfactor)children[2]).generateCode(gc);
			  }
			  if (children[1]!=null && children[1] instanceof ASTmultiplication_operator) {
				  String opt=((ASTmultiplication_operator)children[1]).getOpt();
				  if ("*".equals(opt)) {
					  rg1=gc.registerManager.getFreeRegister();
					  gc.code.append(String.format("pop %s\n",rg1));
					  gc.code.append(String.format("imul %s,%s\n",rg1,rg2));
					  rg2.release();
					  return rg1;
				  }
				  if ("div".equals(opt)) {
					  if (rg2.toString().equals("rax")) {
						  rg1=gc.registerManager.getFreeRegister();
						  gc.code.append(String.format("mov %s,%s\n",rg1,rg2));
						  rg2=rg1;
						  if (rg2.toString().equals("rdx")) {
							  throw new GenerateException("Fatal Error:Something Very Bad!");
						  }
					  } else {
						  if (!gc.registerManager.getRegisterByName("rax").isFree) {
							  throw new GenerateException("Fatal Error:Something Very Bad!");
						  }
						  gc.registerManager.getRegisterByName("rax").acquire();
					  }
					  gc.code.append("pop rax\n");
					  gc.code.append("xor rdx,rdx\n");
					  gc.code.append(String.format("idiv %s\n",rg2));
					  rg2.release();
					  return gc.registerManager.getRegisterByName("rax");
				  }
				  if ("mod".equals(opt)) {
					  if (rg2.toString().equals("rax")) {
						  rg1=gc.registerManager.getFreeRegister();
						  gc.code.append(String.format("mov %s,%s\n",rg1,rg2));
						  rg2=rg1;
					  } else {
						  if (!gc.registerManager.getRegisterByName("rax").isFree) {
							  throw new GenerateException("Something Very Bad!");
						  }
						  gc.registerManager.getRegisterByName("rax").acquire();
					  }
					  if (!rg2.toString().equals("rdx"))
						  gc.registerManager.getRegisterByName("rdx").acquire();
					  gc.code.append(String.format("pop rax\n",rg1));
					  gc.code.append("xor rdx,rdx\n");
					  gc.code.append(String.format("idiv %s\n",rg2));
					  if (!rg2.toString().equals("rdx"))
						  rg2.release();
					  gc.registerManager.getRegisterByName("rax").release();
					  return gc.registerManager.getRegisterByName("rdx");
				  }
				  if ("and".equals(opt)) {
					  rg1=gc.registerManager.getFreeRegister();
					  gc.code.append(String.format("pop %s\n",rg1));
					  gc.code.append(String.format("and %s,%s\n",rg1,rg2));
					  rg2.release();
					  return rg1;
				  }
				  throw new GenerateException("Something Very Bad!\n");
			  } else {
				  throw new GenerateException("Something Very Bad!\n");
			  }
		  }
		  throw new GenerateException("Something Very Bad!\n");
	  }
	  return null;
  }
  public Type getType(GeneratorContext gc) throws GenerateException{
	  if (children!=null && children.length==3) {
		  Type type1=null,type2=null;
		  if (children[0]!=null && children[0] instanceof ASTMultiplicationNode) {
			  type1=((ASTMultiplicationNode)children[0]).getType(gc);
		  }
		  if (children[0]!=null && children[0] instanceof ASTfactor) {
			  type1=((ASTfactor)children[0]).getType(gc);
		  }
		  if (children[2]!=null && children[2] instanceof ASTfactor) {
			  type2=((ASTfactor)children[2]).getType(gc);
		  }
		  if (gc.generate) {
		      if (!(type1 instanceof IntegerType)) {
				  throw new GenerateException("Can not calculate with Non-integer Type!",((SimpleNode)children[0]).currentToken);
			  }
		      if (!(type2 instanceof IntegerType)) {
				  throw new GenerateException("Can not calculate with Non-integer Type!",((SimpleNode)children[2]).currentToken);
			  }
		      return type1;
		  }
		  if (type1 instanceof RecordType || type1 instanceof ArrayType) {
			  throw new GenerateException("Can not calculate with NonSimpleType!",((SimpleNode)children[0]).currentToken);
		  }
		  if (type2 instanceof RecordType || type2 instanceof ArrayType) {
			  throw new GenerateException("Can not calculate with NonSimpleType!",((SimpleNode)children[2]).currentToken);
		  }
		  if (type1 instanceof RealType) {
			  return type1;
		  }
		  if (type2 instanceof RealType) {
			  return type2;
		  }
		  if (type1 instanceof IntegerType) {
			  return type1;
		  }
		  if (type2 instanceof IntegerType) {
			  return type2;
		  }
	      return type1;
	  }
	  throw new GenerateException("Something Very Bad!\n");
  }

}
/* JavaCC - OriginalChecksum=35cddcee5d5c59f5ba3a830253b2b4f4 (do not edit this line) */
