package powellapps.matcheduc.repository

import powellapps.matcheduc.model.Theme

class ThemeRepository {

    companion object {
        fun create(): List<Theme> {
            val themes = ArrayList<Theme>()
            themes.add(Theme("Natureza", "Darwin\n\nConhecendo as bacterias\n\nIabadabaduIabadabaduIabadabaduIabadabaduIabadabadu\n\nNatureza 4Natureza 4Natureza 4Natureza 4Natureza 4"))
            themes.add(Theme("NaturezaNaturezaNaturezaNaturezaNaturezaNaturezaNatureza", "Darwin\n\nConhecendo as bacterias\n\nIabadabaduIabadabaduIabadabaduIabadabaduIabadabadu\n\nNatureza 4Natureza 4Natureza 4Natureza 4Natureza 4"))

            return themes
        }

    }
}