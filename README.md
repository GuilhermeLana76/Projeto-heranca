# Projeto de Herança - Instrumentos Musicais

**Disciplina:** Gestão e Qualidade de Software  
**Professora:** Rafaela Priscila Cruz Moreira

## Integrantes

| Nome | RA |
|------|-----|
| Elias Victor de Jesus Cardoso Machado | 42415030 |
| Guilherme Ryan Costa Lana | 42412875 |

## 📝 Descrição do Projeto

Projeto de herança em Java com o tema de Instrumentos Musicais. A ideia é ter uma superclasse `Instrumento` com as características comuns (nome, fabricante, preço, ano) e duas subclasses: `Violao` e `Piano`.

Cada subclasse tem seus próprios atributos e sobrescreve os métodos `tocar()`, `toString()` e `obterTipoDeSom()` para comportamento específico.

## 🏗️ Estrutura das Classes

### Superclasse: `Instrumento` (Abstrata)
- `nome`, `fabricante`, `preco`, `anoFabricacao`
- Métodos: `tocar()`, `obterTipoDeSom()` (abstrato), `afinador()`
- Getters/Setters para todos os atributos

### Subclasse: `Violao`
- Atributos extras: `numeroDeCordasEstruturadas`, `tipoDeCordasEstruturadas`
- Sobrescreve: `tocar()`, `obterTipoDeSom()`, `toString()`
- Método extra: `afinarCordas()`

### Subclasse: `Piano`
- Atributos extras: `numeroDeTeclas`, `ehGrande`
- Sobrescreve: `tocar()`, `obterTipoDeSom()`, `toString()`
- Método extra: `regularAltura()`

## 🚀 Como Executar

```bash
# Compilar
javac -d target/classes src/main/java/br/edu/projeto/**/*.java

# Executar
java -cp target/classes br.edu.projeto.Main
```

## 🔍 Saída Esperada

A execução do programa demonstra:
- ✅ Criação de objetos das subclasses
- ✅ Armazenamento em lista da superclasse (polimorfismo)
- ✅ Chamada de métodos sobrescritos com comportamento específico
- ✅ Impressão de informações no console

## 🌳 Requisitos Atendidos

- ✅ Superclasse com atributos e métodos comuns
- ✅ Duas subclasses com atributos próprios
- ✅ Pelo menos 1 método sobrescrito por subclasse
- ✅ Polimorfismo usando `List<Instrumento>`
- ✅ Java 17+ com pacote em minúsculas
- ✅ Encapsulamento com getters/setters
- ✅ `Main.java` demonstrando funcionalidades
- ✅ `@Override` em todos os métodos sobrescritos

## 📚 Conceitos Demonstrados

1. **Herança**: as subclasses herdam de `Instrumento`
2. **Polimorfismo**: objetos das subclasses são tratados como `Instrumento`
3. **Sobrescrita (@Override)**: métodos `tocar()`, `obterTipoDeSom()` e `toString()`
4. **Encapsulamento**: uso de getters/setters para acesso aos atributos
5. **Composição**: múltiplos objetos em uma coleção

## 🔧 Fluxo de Trabalho (GitHub Flow)

1. Criar branches de feature para cada componente
2. Fazer commits claros com mensagens descritivas
3. Abrir Pull Requests com code review
4. Mergear na branch `dev` após aprovação
5. Mergear `dev` na `main` como entrega final

## 📎 Referências

- Documentação Java: https://docs.oracle.com/en/java/javase/21/docs/api/
- GitHub Flow: https://guides.github.com/introduction/flow/