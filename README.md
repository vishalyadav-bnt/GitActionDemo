# CI/CD Pipeline with Aqua Trivy Scan for Spring Boot Application

This repository contains a **GitHub Actions workflow** designed for **automating the CI/CD pipeline** of a **Spring Boot application**. It builds the application, creates a Docker image, scans the image for vulnerabilities using **Aqua Trivy**, and uploads the results as artifacts.

---

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Setup](#setup)
3. [Workflow Explanation](#workflow-explanation)
    - [1. Code Checkout](#1-code-checkout)
    - [2. Java Setup](#2-set-up-java-17)
    - [3. Build the JAR File](#3-build-the-jar-file)
    - [4. Build and Push Docker Image](#4-build-and-push-docker-image)
    - [5. Scan Docker Image with Trivy](#5-scan-docker-image-with-trivy)
    - [6. Reports](#6-upload-sarif-and-html-reports)
4. [Customizations](#customizations)
5. [Resources](#resources)

---

## Prerequisites

Before running the workflow, ensure the following are set up:

1. **GitHub Personal Access Token (PAT):**
   - Go to your GitHub account and click on your profile picture at the top right corner
   - Select Settings from the dropdown menu.
   - In the left sidebar, click on Developer settings.
   - Click on Personal access tokens.
   - Click Generate new token.
   - Provide a descriptive name for the token (e.g., "GitHub Actions CI/CD").
   - Select the necessary scopes. For this pipeline, the following permissions are required:
   - write:packages
   - read:packages
   - delete:packages
   - After selecting the appropriate scopes, click Generate token.
   - Copy the token as you won't be able to see it again.
   - Generate a **PAT** with the following permissions:
     - `write:packages`
     - `read:packages`
     - `delete:packages`
   - Save the PAT as a repository secret in GitHub with the name `GHCR_PAT`.

2. **Spring Boot Application:**
   - Ensure your Spring Boot project is configured with **Gradle** as the build tool.
   - The project must have a **Dockerfile** to create the Docker image.

---

## Setup

### 1. Clone the Repository

Clone this repository to your local machine:

```bash
git clone https://github.com/vishalyadav-bnt/GitActionDemo

cd GitActionDemo
