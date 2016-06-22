package shang.better.campainEngine.parser;

public interface ParserTreeConstants {
	public int JJTPROCESS = 0;
	public int JJTVOID = 1;
	public int JJTESCAPEDDIRECTIVE = 2;
	public int JJTESCAPE = 3;
	public int JJTCOMMENT = 4;
	public int JJTTEXTBLOCK = 5;
	public int JJTFLOATINGPOINTLITERAL = 6;
	public int JJTINTEGERLITERAL = 7;
	public int JJTSTRINGLITERAL = 8;
	public int JJTIDENTIFIER = 9;
	public int JJTWORD = 10;
	public int JJTDIRECTIVE = 11;
	public int JJTBLOCK = 12;
	public int JJTMAP = 13;
	public int JJTOBJECTARRAY = 14;
	public int JJTINTEGERRANGE = 15;
	public int JJTMETHOD = 16;
	public int JJTINDEX = 17;
	public int JJTREFERENCE = 18;
	public int JJTTRUE = 19;
	public int JJTFALSE = 20;
	public int JJTTEXT = 21;
	public int JJTIFSTATEMENT = 22;
	public int JJTELSESTATEMENT = 23;
	public int JJTELSEIFSTATEMENT = 24;
	public int JJTSETDIRECTIVE = 25;
	public int JJTEXPRESSION = 26;
	public int JJTASSIGNMENT = 27;
	public int JJTORNODE = 28;
	public int JJTANDNODE = 29;
	public int JJTEQNODE = 30;
	public int JJTNENODE = 31;
	public int JJTLTNODE = 32;
	public int JJTGTNODE = 33;
	public int JJTLENODE = 34;
	public int JJTGENODE = 35;
	public int JJTADDNODE = 36;
	public int JJTSUBTRACTNODE = 37;
	public int JJTMULNODE = 38;
	public int JJTDIVNODE = 39;
	public int JJTMODNODE = 40;
	public int JJTNOTNODE = 41;


	public String[] jjtNodeName = {
	"process",
	"void",
	"EscapedDirective",
	"Escape",
	"Comment",
	"Textblock",
	"FloatingPointLiteral",
	"IntegerLiteral",
	"StringLiteral",
	"Identifier",
	"Word",
	"Directive",
	"Block",
	"Map",
	"ObjectArray",
	"IntegerRange",
	"Method",
	"Index",
	"Reference",
	"True",
	"False",
	"Text",
	"IfStatement",
	"ElseStatement",
	"ElseIfStatement",
	"SetDirective",
	"Expression",
	"Assignment",
	"OrNode",
	"AndNode",
	"EQNode",
	"NENode",
	"LTNode",
	"GTNode",
	"LENode",
	"GENode",
	"AddNode",
	"SubtractNode",
	"MulNode",
	"DivNode",
	"ModNode",
	"NotNode",
	};
}
