// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// ------------------------------------------------------------------------------

package com.microsoft.recognizers.text.choice.resources;

public class PortugueseChoice {

    public static final String LangMarker = "Por";

    public static final String TokenizerRegex = "[^\\w\\d\\u00E0-\\u00FC]";

    public static final String SkinToneRegex = "(\\uD83C\\uDFFB|\\uD83C\\uDFFC|\\uD83C\\uDFFD|\\uD83C\\uDFFE|\\uD83C\\uDFFF)";

    public static final String TrueRegex = "\\b(verdade|verdadeir[oa]|sim|isso|claro|ok)\\b|(\\uD83D\\uDC4D|\\uD83D\\uDC4C){SkinToneRegex}?"
            .replace("{SkinToneRegex}", SkinToneRegex);

    public static final String FalseRegex = "\\b(falso|n[aã]o|incorreto|nada disso)\\b|(\\uD83D\\uDC4E|\\u270B|\\uD83D\\uDD90){SkinToneRegex}?"
            .replace("{SkinToneRegex}", SkinToneRegex);
}
