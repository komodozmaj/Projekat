public class CyrilicToLatinConverter() {
    static char[] cyrilic = new char[] {
        '\u0410', 	'\u0430',	//A
        '\u0411',	'\u0431',	//B
        '\u0412', 	'\u0432',	//V
        '\u0413', 	'\u0433',	//G
        '\u0414',	'\u0434',	//D
        '\u0402',	'\u0452',	//Đ
        '\u0415', 	'\u0435',	//E
        '\u0416',	'\u0436',	//Ž    
        '\u0417',	'\u0437',	//Z			
        '\u0418',	'\u0438',	//I
        '\u0408',	'\u0458',	//J
        '\u041A',	'\u043A',	//K
        '\u041B',	'\u043B',	//L
        '\u0409',	'\u0459',	//Lj
        '\u041C',	'\u043C',	//M
        '\u041D',	'\u043D',	//N
        '\u040A',	'\u045A',	//Nj
        '\u041E', 	'\u043E',	//O
        '\u041F',	'\u043F', 	//P
        '\u0420',	'\u0440',	//R
        '\u0421',	'\u0441',	//S
        '\u0422',	'\u0442',	//T
        '\u040B',	'\u045B',	//Ć
        '\u0423',	'\u0443',	//U
        '\u0424',	'\u0444',	//F
        '\u0425',	'\u0445',	//H
        '\u0426',	'\u0446',	//C	
        '\u0427', 	'\u0447',	//Č
        '\u040F',	'\u045F',	//Dž
        '\u0428',	'\u0448'	//Š
    };

    static char[] latin = new char[] {
        "A", 		"a",
		"B",		"b",
		"V",		"v",
		"G",		"g",
		"D",		"d",
		"\u0110",	"\u0111",
		"E",		"e",
		"\u017D",	"\u017E",
		"Z",		"z",
		"I",		"i",
		"J",		"j",
		"K",		"k",
		"L",		"l",
		"Lj",		"lj",
		"M",		"m",
		"N",		"n",
		"Nj",		"nj",
		"O",		"o",
		"P",		"p",
		"R",		"r",
		"S",		"s",
		"T",		"t",
		"\u0106",	"\u0107",
		"U",		"u",
		"F",		"f",
		"H",		"h",
		"C",		"c",
		"\u010C",	"\u010D",
		"D\u017E",	"d\u017E",
		"\u0160",	"\u0161"
    };

    static Map<Character, String> cyrMap = new HashMap<Character, String>();
    static Map<String, Character> latMap = new HashMap<String, Character>();
}