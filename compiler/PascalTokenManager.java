/* Generated By:JJTree&JavaCC: Do not edit this line. PascalTokenManager.java */
package compiler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import codeGenerator.*;

/** Token Manager. */
public class PascalTokenManager implements PascalConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8000000000L) != 0L)
            return 0;
         if ((active0 & 0xfffffff80L) != 0L)
         {
            jjmatchedKind = 60;
            return 10;
         }
         if ((active0 & 0x400000000000L) != 0L)
            return 31;
         if ((active0 & 0x400000000000000L) != 0L)
            return 32;
         return -1;
      case 1:
         if ((active0 & 0x20c86000L) != 0L)
            return 10;
         if ((active0 & 0xfdf379f80L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 60;
               jjmatchedPos = 1;
            }
            return 10;
         }
         return -1;
      case 2:
         if ((active0 & 0xedf04cf00L) != 0L)
         {
            jjmatchedKind = 60;
            jjmatchedPos = 2;
            return 10;
         }
         if ((active0 & 0x100331080L) != 0L)
            return 10;
         return -1;
      case 3:
         if ((active0 & 0x50008400L) != 0L)
            return 10;
         if ((active0 & 0xe8f044b00L) != 0L)
         {
            jjmatchedKind = 60;
            jjmatchedPos = 3;
            return 10;
         }
         return -1;
      case 4:
         if ((active0 & 0x280000b00L) != 0L)
            return 10;
         if ((active0 & 0xc0f044000L) != 0L)
         {
            jjmatchedKind = 60;
            jjmatchedPos = 4;
            return 10;
         }
         return -1;
      case 5:
         if ((active0 & 0x40c004000L) != 0L)
            return 10;
         if ((active0 & 0x803040000L) != 0L)
         {
            jjmatchedKind = 60;
            jjmatchedPos = 5;
            return 10;
         }
         return -1;
      case 6:
         if ((active0 & 0x802000000L) != 0L)
            return 10;
         if ((active0 & 0x1040000L) != 0L)
         {
            jjmatchedKind = 60;
            jjmatchedPos = 6;
            return 10;
         }
         return -1;
      case 7:
         if ((active0 & 0x40000L) != 0L)
            return 10;
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 60;
            jjmatchedPos = 7;
            return 10;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 39:
         return jjStartNfaWithStates_0(0, 46, 31);
      case 40:
         return jjStopAtPos(0, 54);
      case 41:
         return jjStopAtPos(0, 55);
      case 42:
         return jjStopAtPos(0, 38);
      case 43:
         return jjStopAtPos(0, 36);
      case 44:
         return jjStopAtPos(0, 43);
      case 45:
         return jjStopAtPos(0, 37);
      case 46:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 47:
         return jjStartNfaWithStates_0(0, 39, 0);
      case 58:
         jjmatchedKind = 45;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 59:
         return jjStopAtPos(0, 44);
      case 60:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0xa000000000000L);
      case 61:
         return jjStopAtPos(0, 48);
      case 62:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x20000000000000L);
      case 91:
         return jjStopAtPos(0, 56);
      case 93:
         return jjStopAtPos(0, 57);
      case 94:
         return jjStopAtPos(0, 47);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x180L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0xc00L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x7000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x18000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x60000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0xc00000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x3000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40c000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x70000000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0xa00000000L);
      case 123:
         return jjStartNfaWithStates_0(0, 58, 32);
      case 125:
         return jjStopAtPos(0, 59);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 46:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         break;
      case 61:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(1, 53);
         break;
      case 62:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000400L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x40c000200L);
      case 102:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 10);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(1, 22, 10);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x210000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x80010080L);
      case 111:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(1, 29, 10);
         return jjMoveStringLiteralDfa2_0(active0, 0x324800L);
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 10);
         return jjMoveStringLiteralDfa2_0(active0, 0x803000100L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 100:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(2, 7, 10);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 10);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 10);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xa00000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x40800L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x48000000L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 10);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 10);
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x8400L);
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(2, 21, 10);
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 118:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 10);
         break;
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1040000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 10);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 10);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 10);
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000200L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 110:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 10);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 101:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 10);
         return jjMoveStringLiteralDfa5_0(active0, 0x801000000L);
      case 108:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 10);
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 10);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x6000000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 10);
         return jjMoveStringLiteralDfa5_0(active0, 0x44000L);
      case 121:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 100:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 10);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000L);
      case 110:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(5, 34, 10);
         break;
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 10);
         break;
      case 116:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 109:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(6, 25, 10);
         break;
      case 110:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 10);
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(7, 18, 10);
         break;
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(8, 24, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 31;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 31:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 39)
                  {
                     if (kind > 61)
                        kind = 61;
                  }
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 62)
                        kind = 62;
                     jjCheckNAddStates(3, 9);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 32:
               case 7:
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 0:
                  if (curChar == 47)
                     jjCheckNAddStates(10, 12);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(10, 12);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 60)
                     kind = 60;
                  jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 11:
               case 13:
                  if (curChar == 39)
                     jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 14:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 39 && kind > 61)
                     kind = 61;
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  jjCheckNAddStates(3, 9);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 62)
                     kind = 62;
                  jjCheckNAdd(17);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 19:
                  if (curChar == 46)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(20, 21);
                  break;
               case 22:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(23);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjCheckNAdd(23);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 25:
                  if (curChar == 46)
                     jjCheckNAdd(26);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjCheckNAdd(26);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 29:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(30);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjCheckNAdd(30);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 31:
               case 12:
                  jjCheckNAddStates(0, 2);
                  break;
               case 5:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 60)
                        kind = 60;
                     jjCheckNAdd(10);
                  }
                  else if (curChar == 123)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 32:
                  if ((0xdfffffffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  else if (curChar == 125)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  break;
               case 1:
                  jjAddStates(10, 12);
                  break;
               case 6:
                  if (curChar == 123)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 7:
                  if ((0xdfffffffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar == 125 && kind > 6)
                     kind = 6;
                  break;
               case 9:
               case 10:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 60)
                     kind = 60;
                  jjCheckNAdd(10);
                  break;
               case 21:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(13, 14);
                  break;
               case 28:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(15, 16);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 31:
               case 12:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 32:
               case 7:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(10, 12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 31 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   12, 14, 15, 17, 18, 19, 24, 25, 27, 28, 1, 2, 4, 22, 23, 29, 
   30, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\141\156\144", 
"\141\162\162\141\171", "\142\145\147\151\156", "\143\141\163\145", "\143\157\156\163\164", 
"\144\151\166", "\144\157", "\144\157\167\156\164\157", "\145\154\163\145", "\145\156\144", 
"\146\157\162", "\146\165\156\143\164\151\157\156", "\151\146", "\155\157\144", 
"\156\157\164", "\157\146", "\157\162", "\160\162\157\143\145\144\165\162\145", 
"\160\162\157\147\162\141\155", "\162\145\143\157\162\144", "\162\145\160\145\141\164", "\164\150\145\156", 
"\164\157", "\164\171\160\145", "\165\156\164\151\154", "\166\141\162", 
"\167\150\151\154\145", "\162\145\141\144\154\156", "\167\162\151\164\145\154\156", "\53", "\55", 
"\52", "\57", "\72\75", "\56\56", "\56", "\54", "\73", "\72", "\47", "\136", "\75", 
"\74\76", "\74", "\74\75", "\76", "\76\75", "\50", "\51", "\133", "\135", "\173", 
"\175", null, null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffff81L, 0x0L, 
};
static final long[] jjtoSkip = {
   0x7eL, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[31];
private final int[] jjstateSet = new int[62];
protected char curChar;
/** Constructor. */
public PascalTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   currentToken=null;
   input_stream = stream;
}

/** Constructor. */
public PascalTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 31; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      currentToken=matchedToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         currentToken=matchedToken;
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
public static Token currentToken;

}
