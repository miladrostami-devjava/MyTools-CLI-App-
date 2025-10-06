# 🛠️ MyTools CLI App

**MyTools** is a simple command-line utility that supports features like user login/logout, saving text to a file, displaying saved content, clearing the file, viewing version info, and help instructions.

---

## ✅ Features

- User Login & Logout
- Save text to a file
- Display file content
- Clear the output file
- Show application version
- Display help guide

---

## 🚀 How to Run

To run the program, use the `java` command with the file path:

```bash
java src/main/java/org/example/p9_MyTool/MyTools.java [options]
````

---

## ⚙️ CLI Options

| Command                         | Description                                                 |
| ------------------------------- | ----------------------------------------------------------- |
| `--login [username] [password]` | Logs into the application (e.g. `--login a 1`)              |
| `--logout`                      | Logs out and deletes the session file                       |
| `--save [text...]`              | Saves the provided text to `out.txt` (requires login first) |
| `--show`                        | Displays the content of the output file                     |
| `--clear`                       | Clears all content from `out.txt`                           |
| `--version`                     | Shows the app version                                       |
| `--help`                        | Displays help and usage guide                               |

---

## 📂 Project Structure

| File           | Purpose                                  |
| -------------- | ---------------------------------------- |
| `MyTools.java` | Main class of the application            |
| `out.txt`      | Output file where saved texts are stored |
| `session.txt`  | Session file to manage login status      |

---

## 📌 Notes

* Only one hardcoded user is allowed to login: `username = a`, `password = 1`
* You must login before using the `--save` command.
* Texts are appended line-by-line to `out.txt`.

---

## 👨‍💻 Developer

> Project developed by **Milad Rostami**
> Version: `v1.2.2`

---

## 📜 License

Notes!!! : this project is free for developed

This project is released under the **MIT License**. You are free to use and modify it at your own responsibility.

```

