# Minecraft Base Plugin

A basic Bukkit/Spigot Minecraft server plugin written in Java, serving as an introduction to Minecraft plugin development.

## Authors
- TheoOrigin
- School Project Team

---

## Features
- **Discord Command (`/discord`)**: Sends a customizable message to players in-game with a clickable Discord invitation link.
- **Alert Broadcast Command (`/alert <message>`)**: Broadcasts a gold-colored server-wide alert message to all online players, mentioning the sender's username.

---

## Configuration

The plugin structure and commands are declared in **[plugin.yml](file:///C:/Users/theob/Desktop/Project/Introduction-Minecraft-plugin/plugin.yml)**:
```yaml
name: BasePlugin
version: 1.0
author: TheoOrigin
main: fr.stalagtik.baseplugin.Main
api-version: 1.16
commands:
  discord:
    description: Send discord invitation link
  alert:
    description: Broadcast a server alert
```

---

## Development & Building
- **Language**: Java
- **API**: Bukkit/Spigot API (1.16+)
- **Source Code**:
  - **[Main.java](file:///C:/Users/theob/Desktop/Project/Introduction-Minecraft-plugin/src/fr/stalagtik/baseplugin/Main.java)**: Entry point registers command executors.
  - **[CommandTest.java](file:///C:/Users/theob/Desktop/Project/Introduction-Minecraft-plugin/src/fr/stalagtik/baseplugin/commands/CommandTest.java)**: Implements command execution logic and chat formatting.
