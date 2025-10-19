# 🏨 Hotel Facade System

A **Java project** demonstrating the **Facade Design Pattern** through a hotel management scenario.  
The `FrontDesk` class acts as a **Facade**, simplifying user access to subsystems such as **Valet**, **HouseKeeping**, and **Cart**.

---

## 📑 Table of Contents
- [📘 Overview](#-overview)
- [🧩 Design Pattern Used](#-design-pattern-used)
- [🏗️ Class Structure](#%EF%B8%8F-class-structure)
- [🖼 UML Diagram](#-uml-diagram)
- [⚙️ How It Works](#%EF%B8%8F-how-it-works)
- [🧠 Key Takeaways](#-key-takeaways)
- [🧪 Example Output](#-example-output)
- [📂 Project Structure](#-project-structure)
- [👨‍💻 Author](#-author)

---

## 📘 Overview

This project showcases how the **Facade Pattern** simplifies interactions between complex hotel services.  
Instead of directly dealing with multiple subsystems, the client communicates only with the **FrontDesk**.

**Subsystems:**
- 🚗 **Valet Service** — Handles vehicle pickup and parking.  
- 🧹 **HouseKeeping** — Manages room cleaning.  
- 🧳 **Cart Service** — Handles luggage cart requests.  

---

## 🧩 Design Pattern Used

### 🧱 **Facade Pattern**

> The **Facade Pattern** provides a simplified interface to a larger body of code, making it easier for clients to interact with complex subsystems.

**Key Roles:**
| Role | Class | Description |
|------|--------|-------------|
| 🎯 Client | `HotelApp` | User-facing app that interacts with the `FrontDesk` |
| 🏢 Facade | `FrontDesk` | Simplifies access to subsystems |
| 🧹 Subsystems | `Valet`, `HouseKeeping`, `Cart` | Individual services performing specific tasks |
| 🔧 Interface | `HotelService` | Declares the `performService()` method for all subsystems |

---

## 🏗️ Class Structure

- **HotelApp** → Entry point calling `FrontDesk`
- **FrontDesk** → Facade coordinating all services
- **Valet** → Implements car valet logic
- **HouseKeeping** → Implements room cleaning logic
- **Cart** → Handles luggage carts
- **HotelService (Interface)** → Defines the `performService()` contract

---

## 🖼 UML Diagram

The UML below illustrates the class relationships and interactions in the system:

![Hotel Facade UML Diagram](FACADE%20(UML).jpeg)

---

## ⚙️ How It Works

1. The user (via `HotelApp`) interacts **only** with `FrontDesk`.
2. The `FrontDesk` forwards service requests to the appropriate subsystem.
3. Each subsystem executes its `performService()` implementation.

### Example Code:
```java
FrontDesk frontDesk = new FrontDesk();

frontDesk.requestValet("XYZ123");
frontDesk.requestCleaning(204);
frontDesk.requestCart(2);
