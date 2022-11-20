package com.craftinginterpreters.lox;

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return "\033[1;96m[Token]\033[0m \033[1;93mType:\033[0m " + type + "\t \033[1;93mLexeme:\033[0m " + lexeme + "\t \033[1;93mLiteral:\033[0m " + literal;
    }
    
}
