Exemplo de um verificador de senhas por meio da requisição post

Verificadores do codigo
- Verifica se a senha possui pelo menos 08 caracteres.
- Verifica se a senha contém pelo menos uma letra maiúscula.
- Verifica se a senha contém pelo menos uma letra minúscula.
- Verifica se a senha contém pelo menos um dígito numérico.
- Verifica se a senha contém pelo menos um caractere especial (e.g, !@#$%)
```json
{
    "valor": "Senha123!"
}
```
Resposta esperada
```
Status: 204 No Content
```
Exemplo de codigos recusados
```json
{
    "valor": "senha123!"
}
```
```
Status: 400 Bad Request
"Senha deve conter pelo menos um caracter maiusculo"
```
```json
{
    "valor": "SENHA123!"
}
```
```
Status: 400 Bad Request
"Senha deve conter pelo menos um caracter minusculo"
```
```json
{
    "valor": "senhasenha!"
}
```
```
Status: 400 Bad Request
"Senha deve conter pelo menos um digito",
"Senha deve conter pelo menos um caracter maiusculo"
```
```json
{
    "valor": "senha1234"
}
```
```
Status: 400 Bad Request
"Senha deve conter pelo menos um caracter maiusculo",
"Senha deve conter pelo menos um caracter especial"
```
```json
{
    "valor": "senha"
}
```
```
"Senha deve conter pelo menos 8 digitos",
"Senha deve conter pelo menos um digito",
"Senha deve conter pelo menos um caracter maiusculo",
"Senha deve conter pelo menos um caracter especial"
```
