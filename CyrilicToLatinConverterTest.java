@Test
public static String cyrilicToLatin(String cyrilicText){
    CyrilicToLatinConverter conv = new CyrilicToLatinConverter();
    cyrilicText = "Илија Тасић";
    String expResult = "Ilija Tasić";
    String result = conv.cyrilicToLatin(cyrilicText);
    assertEquals(expResult, result);
}