# Qualidade de Software — Aula 09: Versionamento e Git Avançado

Repositório da Aula 09 (Git Flow, GitHub Actions e Code Review). Projeto Java 17 com Maven e JUnit 5.

## Git Flow

| Branch | Uso |
|---|---|
| `main` | Código em produção (versões `v1.0`, `v1.0.1`) |
| `develop` | Integração das features |
| `feature/*` | Novas funcionalidades (`feature/login`, `feature/calculadora`, `feature/notificacoes`, `feature/javadoc`) |
| `release/*` | Preparação de versão (`release/v1.0`) |
| `hotfix/*` | Correções urgentes a partir da `main` (`hotfix/header-null`) |

Fluxo de uma feature:

```bash
git checkout develop
git pull origin develop
git checkout -b feature/login
git add .
git commit -m "Implementa validação de senha"
git push origin feature/login
# Criar PR no GitHub para merge em develop
```

## GitHub Actions

- `.github/workflows/pr-validation.yml` — roda `mvn clean test` (JDK 17) em todo Pull Request.
- `.github/workflows/javadoc.yml` — gera o Javadoc automaticamente a cada push na `main`/`develop` e publica como artefato do workflow.

## Proteção de branch

`main` e `develop` exigem Pull Request com o check **build** passando e **2 aprovações**.

## Padrão de commits (Conventional Commits)

`tipo(escopo opcional): descrição` — tipos usados: `feat`, `fix`, `test`, `docs`, `ci`, `chore`, `refactor`.
Exemplos: `feat: NotificacaoService com envio de e-mail`, `fix: trata divisão por zero na Calculadora`.

## Como rodar

```bash
mvn clean test
```
