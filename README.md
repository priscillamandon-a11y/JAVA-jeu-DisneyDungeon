# 🎮 Projet Java Débutant : Disney Dungeon

Disney Dungeon est un petit jeu en Java conçu pour apprendre les bases de la programmation orientée objet. 
Le joueur crée un personnage (Guerrier ou Magicien), lui attribue un équipement, puis interagit avec un menu en console pour afficher ou modifier ses informations. Dans les étapes suivantes du projet, le personnage pourra avancer sur un plateau de 64 cases grâce à un lancer de dé virtuel. L’objectif principal n’est pas de créer un jeu complet, mais de comprendre comment structurer un projet Java avec plusieurs classes, comment manipuler des objets, et comment organiser la logique d’un programme. 

### 📌 Fonctionnalités

- Création d’un personnage (type + nom)
- Gestion de l’équipement offensif et défensif
- Affichage des informations du personnage
- Modification des informations
- Menu simple en console
- Préparation du plateau de jeu (64 cases)

### 🛠️ Technologies utilisées

- Java 17+
- IntelliJ IDEA (ou autre IDE Java)
- Programmation orientée objet (classes, objets, getters/setters, constructeurs)
- Scanner pour lire les choix de l’utilisateur

## 🚀 Démarrage rapide

### Prérequis

- Java installé sur l’ordinateur  
- Un IDE (IntelliJ, Eclipse, VS Code…)

### Installation

Cloner le dépôt :

```
git clone https://github.com/priscillamandon-a11y/JAVA-jeu-DisneyDungeon.git
```

Ouvrir le projet dans votre IDE, puis lancer la classe : `Main.java`

---

## 🔧 Diagramme UML

```mermaid
classDiagram
    class Main {
        + main(String[] args)
    }

    class Game {
        - Menu menu
        - Character character
        - Board board
        - Dice dice
        - Player player
        + gameIntro()
        + createCharacter()
        + startGame()
        + playTurn(Cell)
        + fight(Enemy)
        + flee()
        + endOfGame()
    }

    class Menu {
        - Scanner scanner
        + showMainMenu()
        + askCharacterType()
        + askCharacterName()
        + displayCharacter(Character)
        + previewCharacter(Character)
        + startGame(Player)
        + displayPosition(int, int)
        + askRollDice()
        + chooseInteract(String)
        + looseGame()
        + winGame()
        + quitGame()
    }

    class Player {
        - int playerNumber
        - Character character
        - int position
        + getCharacter()
        + getPlayerNumber()
        + getPosition()
        + setPosition(int)
    }

    class Character {
        <<abstract>>
        - String name
        - String type
        - int life
        - int attack
        - DefensiveEquipement defensiveEquipement
        - OffensiveEquipement offensiveEquipement
        + getName()
        + getType()
        + getLife()
        + getAttack()
        + getOffensiveEquipement()
        + getDefensiveEquipement()
        + setLife(int)
        + setOffensiveEquipement(OffensiveEquipement)
        + setDefensiveEquipement(DefensiveEquipement)
        + toString()
    }

    class Warrior {
        + Warrior(String, DefensiveEquipement, OffensiveEquipement)
        + toString()
    }

    class Wizard {
        + Wizard(String, DefensiveEquipement, OffensiveEquipement)
        + toString()
    }

    class OffensiveEquipement {
        <<abstract>>
        - String type
        - int attackLevel
        - String name
        + getType()
        + getAttackLevel()
        + getName()
        + toString()
    }

    class BasicWeapon {
        + BasicWeapon()
        + toString()
    }

    class SultanSword {
        + SultanSword()
        + toString()
    }

    class KingTritonTrident {
        + KingTritonTrident()
        + toString()
    }

    class HerculeSword {
        + HerculeSword()
        + toString()
    }

    class BasicSpell {
        + BasicSpell()
        + toString()
    }

    class ArielStorm {
        + ArielStorm()
        + toString()
    }

    class DragonFire {
        + DragonFire()
        + toString()
    }

    class LightningZeus {
        + LightningZeus()
        + toString()
    }

    class DefensiveEquipement {
        <<abstract>>
        - String type
        - int defenseLevel
        - String name
        + getType()
        + getDefenseLevel()
        + getName()
        + toString()
    }

    class BasicShield {
        + BasicShield()
        + toString()
    }

    class BlueFairyShield {
        + BlueFairyShield()
        + toString()
    }

    class HerculeShield {
        + HerculeShield()
        + toString()
    }

    class BiscuitSimba {
        + BiscuitSimba()
        + toString()
    }

    class ElixirMulan {
        + ElixirMulan()
        + toString()
    }

    class EnchantedRedApple {
        + EnchantedRedApple()
        + toString()
    }

    class PotionTinkerbell {
        + PotionTinkerbell()
        + toString()
    }

    class Board {
        - int size
        - ArrayList~Cell~ cells
        + getSize()
        + buildBoard()
        + getCell(int)
    }

    class Dice {
        - int face
        + rollOfDice()
        + getFace()
        + setFace(int)
        + toString()
    }

    class Cell {
        <<abstract>>
        - int index
        + getType()
        + toString()
        + interact()
        + getEnemy()
        + getDefensiveEquipement()
        + getOffensiveEquipement()
    }

    class EmptyCell {
        + EmptyCell(int)
        + getType()
        + toString()
        + interact()
    }

    class EnemyCell {
        - Enemy enemy
        + EnemyCell(int, Enemy)
        + getEnemy()
        + getType()
        + toString()
        + interact()
    }

    class PotionCell {
        - DefensiveEquipement defensiveEquipement
        + PotionCell(int, DefensiveEquipement)
        + getDefensiveEquipement()
        + getType()
        + toString()
        + interact()
    }

    class WeaponCell {
        - OffensiveEquipement offensiveEquipement
        + WeaponCell(int, OffensiveEquipement)
        + getOffensiveEquipement()
        + getType()
        + toString()
        + interact()
    }

    class Enemy {
        <<abstract>>
        - String name
        - String description
        - String type
        - int lifeLevel
        - int attackPower
        - int defense
        + getName()
        + getDescription()
        + getType()
        + getLifeLevel()
        + getAttackPower()
        + getDefense()
        + setLifeLevel(int)
        + toString()
    }

    class Maleficent {
        + Maleficent()
        + toString()
    }

    class HadesGodOfTheUnderworld {
        + HadesGodOfTheUnderworld()
        + toString()
    }

    class ScarLion {
        + ScarLion()
        + toString()
    }

    class SnakeKaa {
        + SnakeKaa()
        + toString()
    }

    class ProwlerOfTheRuins {
        + ProwlerOfTheRuins()
        + toString()
    }

    class OutOfBoardException {
        + OutOfBoardException(String)
    }

    Main --> Game : lance
    Game --> Menu : utilise
    Game --> Board : utilise
    Game --> Dice : utilise
    Game --> Player : utilise
    Game --> Character : utilise
    Game --> Cell : utilise
    Game --> Enemy : utilise
    Player --> Character : possède
    Character <|-- Warrior
    Character <|-- Wizard
    OffensiveEquipement <|-- BasicWeapon
    OffensiveEquipement <|-- SultanSword
    OffensiveEquipement <|-- KingTritonTrident
    OffensiveEquipement <|-- HerculeSword
    OffensiveEquipement <|-- BasicSpell
    OffensiveEquipement <|-- ArielStorm
    OffensiveEquipement <|-- DragonFire
    OffensiveEquipement <|-- LightningZeus
    DefensiveEquipement <|-- BasicShield
    DefensiveEquipement <|-- BlueFairyShield
    DefensiveEquipement <|-- HerculeShield
    DefensiveEquipement <|-- BiscuitSimba
    DefensiveEquipement <|-- ElixirMulan
    DefensiveEquipement <|-- EnchantedRedApple
    DefensiveEquipement <|-- PotionTinkerbell
    Board --> Cell : contient
    Cell <|-- EmptyCell
    Cell <|-- EnemyCell
    Cell <|-- PotionCell
    Cell <|-- WeaponCell
    EnemyCell --> Enemy : contient
    PotionCell --> DefensiveEquipement : contient
    WeaponCell --> OffensiveEquipement : contient
    Enemy <|-- Maleficent
    Enemy <|-- HadesGodOfTheUnderworld
    Enemy <|-- ScarLion
    Enemy <|-- SnakeKaa
    Enemy <|-- ProwlerOfTheRuins
    Game --> OutOfBoardException : lance

> Le diagramme ci-dessus fournit une vue d'ensemble des principales classes et de leurs relations.

