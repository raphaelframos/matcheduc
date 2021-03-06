package powellapps.matcheduc.repository

import powellapps.matcheduc.model.Theme
import java.util.*
import kotlin.collections.ArrayList

class ThemeRepository {

    companion object {
        fun create(): List<Theme> {
            val themes = ArrayList<Theme>()
            val descriptions = Arrays.asList("O texto argumentativo", "Elementos da argumentação", "Vozes na argumentação", "Estratégias argumentativas")
            themes.add(Theme("O Bullying nas redes sociais", "Português" , descriptions))
            val descriptions2 = Arrays.asList("Análise de temas I", "Assunto x tema", "Tipos de propostas")
            themes.add(Theme("O baixo acesso à leitura e o futuro do Brasil", "Redação", descriptions2))

            val descriptions3 = Arrays.asList("Gêneros Argumentativos I: Coluna / Artigo de opinião / Editorial", "Conceito e estrutura", "Recursos e finalidades")
            themes.add(Theme("Impunidade", "Literatura" ,  descriptions3))

            val descriptions4 = Arrays.asList("Análise de temas II", "Direcionamento dado à proposta", "Interpretação adequada das palavras chaves", "Marcação de eixos de tempo e espaço")
            themes.add(Theme("Os efeitos de um público leitor deficiente no Brasil de hoje", "Redação",  descriptions4))
            return themes
        }

        fun createExams(): List<Theme> {
            val themes = ArrayList<Theme>()
            val descriptions = Arrays.asList("Debate")
            themes.add(Theme("O baixo acesso à leitura e o futuro do Brasil", "Redação", descriptions))
            val descriptions2 = Arrays.asList("Prova discursiva", "Debate")
            themes.add(Theme("Impunidade", "Redação", descriptions2))

            val descriptions3 = Arrays.asList("Gêneros Argumentativos I: Coluna / Artigo de opinião / Editorial", "Conceito e estrutura", "Recursos e finalidades")
            themes.add(Theme("Impunidade", "Redação", descriptions3))

            val descriptions4 = Arrays.asList("Análise de temas II", "Direcionamento dado à proposta", "Interpretação adequada das palavras chaves", "Marcação de eixos de tempo e espaço")
            themes.add(Theme("Os efeitos de um público leitor deficiente no Brasil de hoje", "Redação", descriptions4))
            return themes
        }

    }
}