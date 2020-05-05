package powellapps.matcheduc.repository

import powellapps.matcheduc.model.Theme

class ThemeRepository {

    companion object {
        fun create(): List<Theme> {
            val themes = ArrayList<Theme>()
            themes.add(Theme("O Bullying nas redes sociais", "O texto argumentativo\n\nElementos da argumentação" +
                    "\n\nVozes na argumentação\n\nEstratégias argumentativas"))
            themes.add(Theme("NaturezaNaturezaNaturezaNaturezaNaturezaNaturezaNatureza", "Darwin\n\nConhecendo as bacterias\n\nIabadabaduIabadabaduIabadabaduIabadabaduIabadabadu\n\nNatureza 4Natureza 4Natureza 4Natureza 4Natureza 4"))

            return themes
        }

    }
}