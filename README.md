# 🌀 Naruto Class

Repository containing a set of classes based on the **Naruto** anime.

---

## 📐 Class Design

The classes were developed following the **UML diagram** to represent their structure and relationships.

```mermaid
classDiagram
    class EntidadePolitica {
        <<abstract>>
        -nome: String
        -atuacao: String
    }

    class Pais {
        -localizacao: String
        -estilo: String
    }

    class Vila {
        -localizacao: String
        -bandana: String
    }

    class Cla {
        -simbolo: String
    }

    class KekkeiGenkai {
        -nome: String
        -caracteristica: String
        -descricao: String
        -ativado: boolean
    }

    class Artefato {
        -nome: String
        -tipo: String
        -raridade: int
        -proibido: boolean
        -habilidade: String
        -localizacao: String
    }

    class Ser {
        <<abstract>>
        -nome: String
        -apelido: String
        -chakra: int
    }

    class Shinobi {
        -sexo: String
        -nascimento: Date
        -categoria: String
        -renegado: boolean
    }

    class Time {
        -numero: int
        -ativo: boolean
    }

    class Missao {
        -rank: String
        -descricao: String
        -recompensa: String
    }

    class Jutsu {
        <<abstract>>
        -nome: String
        -proibido: boolean
        -efeito: String
    }

    class Taijutsu {
        -forca: int
        -velocidade: int
    }

    class Ninjutsu {
        -duracao: int
    }

    class Genjutsu {
        -sentido: String
    }

    class Bijuu {
        -totalCaudas: int
        -forma: String
    }

    class Humano {
        -sexo: String
        -nascimento: Date
        -classeSocial: String
    }

    %% --- Heranças ---
    EntidadePolitica <|-- Pais
    EntidadePolitica <|-- Vila
    EntidadePolitica <|-- Cla
    Vila --o Pais
    Cla --o Vila
    Cla <.. KekkeiGenkai
    Ser <|-- Shinobi
    Ser <|-- Bijuu
    Ser <|-- Humano
    Ser --* Artefato
    Ser --o Vila
    Jutsu <|-- Taijutsu
    Jutsu <|-- Ninjutsu
    Jutsu <|-- Genjutsu

    %% --- Relacionamentos ---
    Pais "1" --> "1" Vila : governa
    Vila "1" --> "1..*" Shinobi : lidera
    Vila "1" --> "1..*" Cla : clas
    Cla "1" --> "1..*" Shinobi : shinobis
    Shinobi "1" --> "*" KekkeiGenkai : kekkeigenkais
    Shinobi "1" --> "*" Time : shinobis
    Shinobi "1" --> "1" Bijuu : bijuus
    Shinobi "*" --> "*" Jutsu : jutsus
    Time "1" --> "*" Missao : missoes
```

---

## 📂 Project Organization

The project files are organized to facilitate understanding and maintenance, following a clear folder and class structure.

```bash
.
├── base
│   ├── ecot12-lab04.pdf # Lab Guide
│   ├── naruto-inicial.dia # UML Diagram
│   ├── naruto-inicial.png # Diagram .png file
│   └── naruto-inicial.png~
└── src/main/java/br/edu/unifei/ecot12/naruto/ # Project Classes
│   ├── Artefato.java
│   ├── Bijuu.java
│   ├── Cla.java
│   ├── EntidadePolitica.java
│   ├── Genjutsu.java
│   ├── Jutsu.java
│   ├── KekkeiGenkai.java
│   ├── Main.java # Main file
│   ├── Missao.java
│   ├── Ninjutsu.java
│   ├── Pais.java
│   ├── Ser.java
│   ├── Shinobi.java
│   ├── Taijutsu.java
│   ├── Time.java
│   └── Vila.java
└── ...
```









