package powellapps.matcheduc.repository

import powellapps.matcheduc.model.Theme
import java.util.*
import kotlin.collections.ArrayList

class ThemeRepository {

    companion object {
        fun create(): List<Theme> {
            val themes = ArrayList<Theme>()
            val descriptions = Arrays.asList("O texto argumentativo", "Elementos da argumentação", "Vozes na argumentação", "Estratégias argumentativas")
            themes.add(Theme("O Bullying nas redes sociais", descriptions))
            return themes
        }

    }
}