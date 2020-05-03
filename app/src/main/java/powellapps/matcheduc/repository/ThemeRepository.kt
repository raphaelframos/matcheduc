package powellapps.matcheduc.repository

import powellapps.matcheduc.model.Theme

class ThemeRepository {

    companion object {
        fun create(): List<Theme> {
            val themes = ArrayList<Theme>()
            themes.add(Theme("Dragon Ball Z"))
            themes.add(Theme("Cavaleiros do Zodiacos"))
            themes.add(Theme("Batman"))
            themes.add(Theme("Caverna do Dragão"))
            return themes
        }

    }
}