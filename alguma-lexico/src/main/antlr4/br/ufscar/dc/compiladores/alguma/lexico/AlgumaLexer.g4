lexer grammar AlgumaLexer;

COMENTARIO: COMENTARIO_ERRO
            '}'
            -> skip;

/* Erro de comentario */
COMENTARIO_ERRO: '{'
            (' ' | 'A'..'Z' | 'a'..'z' | '0'..'9' | '\u0080'..'\uffff' | SIMBOLOS | SIMBOLO_NAODEFINIDO | CADEIA | OP_RELACIONAL|OPERADORES_ARITMETICOS )*
            ;

/* Definicao das palavras-chave*/
PALAVRAS_CHAVE: 'algoritmo' | 'declare' | 'constante' | 'tipo' 
| 'literal' | 'inteiro' | 'real' | 'logico' | 'verdadeiro' | 'falso' | 'registro' | 'fim_registro' | 'procedimento' | 'fim_procedimento'
| 'funcao' | 'fim_funcao' | 'var' | 'leia' | 'escreva' | 'se' | 'entao' | 'senao' | 'fim_se'
| 'caso' | 'seja' | 'fim_caso' | 'para' | 'ate' | 'faca' | 'fim_para' | 'enquanto' | 'fim_enquanto' 
| 'retorne' | 'nao' | '<-' | 'fim_algoritmo'; 

/* Define simbolos utilizados */
SIMBOLOS: ':' | '=' | ',' | '[' | ']' | '^' | '(' | ')' | '-' | '&' | '..' | '.'; 

/* Definição de operadores */
OPERADORES_ARITMETICOS: '+' | '-' | '*' | '/' |'%';

OP_RELACIONAL: '=' | '<>' | '>=' | '<=' | '>' | '<';

OP_LOGICOs: 'ou' | 'e'; 


/* Define identificadores: Inicia-se com caractere alfabético (nã́o pode ser números)*/
/* Único caractere especial permitido é o ' '_ ''*/
IDENT: ('A'..'Z' | 'a'..'z' | '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '_')*; 

/* Define cadeias da linguagem: começa e termina com aspas duplas. */
CADEIA: '"'(~('"'|'\n'))*'"';    

/* Erro de cadeia  */
ERRO_CADEIA: '"'(~('"'|'\n'))*;

/* Define numeros inteiros (de 0 a 9 uma ou mais vezes)*/
NUM_INT: ('0'..'9')+; 

/* Define numeros reais: NUMINT seguido por um '.' e NUMINT novamente  */
NUM_REAL: ('0'..'9')+'.'('0'..'9')+; 

/* Erro Simbolo nao definido */
ERRO_SIMBOLO: SIMBOLO_NAODEFINIDO | '}'; 

/* Simbolos nao definidos que geram erro  */
SIMBOLO_NAODEFINIDO:'@' | '$' | '¨' | '~' | '!' | ';' | '%' | '?'; 

/* Ignorar espaços, quebras de linha, etc */
WS: [ \t\r\n]+ -> skip;    