# 💱 CurrencyX - Full Stack Dashboard

Este é um projeto **Full Stack** desenvolvido para consulta e visualização de taxas de câmbio em tempo real. O sistema consome uma API financeira externa, processa os dados num backend robusto e apresenta-os numa interface reativa e moderna.

---
<table border="0">
  <tr>
    <!-- Coluna do Frontend -->
    <td valign="top" align="center" width="50%">
      <p align="center"><b>Frontend Dashboard</b></p>
      <img src="./img/localhost4200_dashboard.jpg" width="100%">
    </td>
    <!-- Coluna do Backend -->
    <td valign="top" align="center" width="50%">
      <p align="center"><b>Backend JSON API</b></p>
      <img src="./img/localhost8080_api_cambio_json.jpg" width="100%">
    </td>
  </tr>
</table>


## 🛠️ Tecnologias e Conceitos Utilizados

### **Backend (API)**
*   **Java 21:** Utilização de **Records** para uma estrutura de dados imutável e concisa.
*   **Spring Boot 3.x:** Framework base para a criação da API REST.
*   **Maven:** Gestão de dependências e build do projeto.
*   **RestTemplate:** Integração e consumo de API de terceiros (ExchangeRate-API).
*   **Externalized Configuration:** Gestão de chaves de API através de variáveis de ambiente e `@Value`.
*   **CORS Configuration:** Configuração de segurança para permitir a comunicação com o Frontend.

### **Frontend (Web)**
*   **Angular 18:** Framework moderno utilizando **Standalone Components**.
*   **TypeScript:** Programação tipada para maior segurança e escalabilidade.
*   **HttpClient:** Consumo assíncrono de recursos do Backend.
*   **RxJS:** Utilização de Observables para subscrição de fluxos de dados.
*   **CSS Flexbox/Grid:** Interface limpa, responsiva e focada na experiência do utilizador (UX).

---

## ⚙️ Como executar o projeto localmente

### Pré-requisitos
*   JDK 21 instalado
*   Maven 3.9+ instalado
*   Node.js (LTS) e Angular CLI instalados

### 1. Clonar o repositório
```bash
git clone https://github.com/reafreitas1/currency_x_fullstack.git
cd currency_x_fullstack
```

### 2. Configurar e rodar o Backend (Java)
1. Obtenha uma chave gratuita em exchangerate-api.com.
2. No ficheiro currency_x_api/src/main/resources/application.properties, adicione a sua chave:
api.exchangerate.key=SUA_CHAVE_AQUI
3. No IntelliJ ou terminal:
```bash
cd currency_x_api
mvn spring-boot:run
```
### 3. Configurar e rodar o Frontend (Angular)
1. Abra um novo terminal na pasta do projeto:
```bash
cd currency-x-web
npm install
ng serve
```
2. Aceda a http://localhost:4200 no seu browser.

### 👩👩‍💻 Sobre Mim
* **LinkedIn:** linkedin.com/in/reafreitas1/
* **GitHub:** github.com/reafreitas1
* **Localização:** Porto, Portugal
