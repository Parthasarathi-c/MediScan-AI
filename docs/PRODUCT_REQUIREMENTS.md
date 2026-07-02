# MediScan AI - Product Requirements

## 1. Project Name

**MediScan AI**

An Android application that helps users identify and understand medicines by scanning a medicine strip or package using the phone camera.

---

## 2. Problem Statement

Patients and caregivers frequently encounter medicines — their own or a family member's — without a clear understanding of what they are, what they treat, or how they should be taken. Common pain points include:

- Medicine strips often display only a brand name or a partial name, with no easily accessible explanation of the drug's purpose, dosage form, or precautions.
- Medical and pharmaceutical terminology on packaging (composition, salts, drug class) is difficult for a layperson to interpret.
- Searching for a medicine online is time-consuming and often surfaces inconsistent, unreliable, or overly technical information.
- There is no simple way to keep a personal record of medicines encountered over time or to set reminders for taking them.

Users need a fast, reliable, and easy-to-understand way to identify a medicine and access trustworthy, simplified information about it — directly from their phone.

---

## 3. Proposed Solution

MediScan AI allows a user to point their phone camera at a medicine strip or package and instantly receive a simplified, easy-to-understand explanation of the medicine.

The application will:

- Use **Optical Character Recognition (OCR)** to extract the medicine name from a scanned image.
- Query trusted third-party medicine information APIs to retrieve verified data about the identified medicine.
- Use an **AI language model** to convert technical medicine information into clear, simple, layperson-friendly explanations.
- Allow users to **save** identified medicines for future reference.
- Maintain a **scan history** so users can revisit previously scanned medicines.
- Allow users to create **reminders** to take saved medicines at specified times.

MediScan AI is intended strictly for **educational and informational purposes**. It is explicitly **not** a diagnostic or prescription tool and will consistently direct users to consult a licensed healthcare professional for medical decisions.

---

## 4. Target Users

| User Segment | Description |
|---|---|
| **General consumers / patients** | Individuals who want to quickly understand a medicine prescribed to them or found at home. |
| **Caregivers** | People managing medication for elderly parents, children, or dependents. |
| **Students (Pharmacy/Nursing/Medical)** | Students seeking a quick, simplified reference while studying pharmacology. |
| **Elderly users** | Users who may struggle with small print or complex medical terminology and benefit from simplified explanations. |

---

## 5. Project Objectives

1. Enable users to identify a medicine within seconds using only their phone camera.
2. Present medicine information in **simple, non-technical language** rather than raw clinical data.
3. Ensure all medicine information originates from **trusted, verifiable sources**.
4. Provide users with tools to **organize and track** medicines relevant to them (save, history, reminders).
5. Maintain a strong, visible disclaimer that the app is **not a substitute for professional medical advice**.
6. Provide an intuitive and accessible user experience for users of all ages through a clean, modern Android interface.
7. Deliver a smooth, reliable, production-quality mobile experience suitable for demonstration as a professional portfolio project.

---

## 6. Scope of Version 1 (MVP)

The MVP will focus on the core scan-to-understanding workflow along with essential personal record-keeping features.

### In Scope

- **Camera-Based Scanning**
  - Capture an image of a medicine strip/package using the device camera.
  - Option to select an existing image from the gallery.
- **OCR Text Extraction**
  - Extract readable text (medicine name) from the captured image.
- **Medicine Information Retrieval**
  - Query a trusted external medicine database/API using the extracted name.
  - Handle cases where the medicine cannot be identified or found.
- **AI-Simplified Explanation**
  - Convert retrieved medicine data into a simple, easy-to-understand summary (purpose, common usage, general precautions).
- **Scan History & Saved Medicines**
  - Allow users to save identified medicines to a personal list for later reference.
  - Maintain a chronological log of past scans, viewable by the user.
  - Previously scanned medicines remain accessible without an internet connection.
- **Basic Medicine Reminders**
  - Allow users to set simple time-based reminders for saved medicines.
  - Local notifications to alert the user at the scheduled time.
- **Medical Disclaimer**
  - Persistent and prominent disclaimer stating the app is for educational purposes only and does not replace professional medical consultation.
- **Core Navigation**
  - Basic screens: Home/Scan, Result, Saved Medicines, History, Reminders.

### Out of Scope (for MVP)

- User accounts, authentication, or cloud sync (single-device, local-first experience).
- Multi-language OCR/translation support.
- Drug interaction checking.
- Barcode/QR code scanning.
- Social or sharing features.

---

## 7. Future Scope (Version 2+)

The following enhancements are planned for consideration after the MVP has been validated:

- **User Accounts & Cloud Sync** — Secure login and cross-device synchronization of saved medicines, history, and reminders.
- **Barcode/QR Code Scanning** — Faster and more accurate identification via printed barcodes in addition to OCR.
- **Multi-Language Support** — OCR and AI explanations available in regional and international languages.
- **Drug Interaction Warnings** — Alerts when saved medicines may interact with one another (with clear educational-only framing).
- **Prescription Scanning** — Ability to scan a full prescription and extract multiple medicines at once.
- **Voice Assistance** — Text-to-speech playback of medicine explanations for accessibility.
- **Caregiver/Family Sharing** — Shared medicine lists and reminders for family members or dependents.
- **Advanced Reminder System** — Recurring schedules, dosage tracking, and adherence reports.
- **Expanded Offline Mode** — Offline-capable OCR and scanning for new medicines, beyond MVP's read-only offline access to already-saved data.
- **Wearable Integration** — Reminder notifications extended to smartwatches.

---

## 8. Technology Stack


| Layer / Component             | Selected Technology                              |
| ----------------------------- | ------------------------------------------------ |
| **Platform**                  | Android (Native)                                 |
| **Programming Language**      | Kotlin                                           |
| **UI Framework**              | Jetpack Compose                                  |
| **Architecture Pattern**      | MVVM + Clean Architecture                        |
| **Dependency Injection**      | Hilt                                             |
| **Navigation**                | Navigation Compose                               |
| **Camera**                    | CameraX                                          |
| **OCR Engine**                | Google ML Kit Text Recognition                   |
| **Networking**                | Retrofit + OkHttp                                |
| **Medicine Data Source**      | Trusted Third-Party Medicine Information API     |
| **AI**                        | Gemini API *(primary)*                           |
| **Local Database**            | Room Database (SQLite)                           |
| **Local Preferences**         | DataStore                                        |
| **Image Loading**             | Coil                                             |
| **Asynchronous Programming**  | Kotlin Coroutines                                |
| **Authentication**            | Firebase Authentication *(Version 2 - Optional)* |
| **Notifications / Reminders** | WorkManager + Notification API                   |
| **Version Control**           | Git + GitHub                                     |


---

> **Disclaimer:** MediScan AI is designed strictly for educational and informational purposes. It does not provide medical advice, diagnosis, or treatment recommendations, and is not a substitute for consultation with a qualified healthcare professional.
