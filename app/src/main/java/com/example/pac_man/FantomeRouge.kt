package com.example.pac_man

import android.content.res.Resources

class FantomeRouge(
    resources: Resources,
    caseWidth: Int,
    caseHeight: Int
) : Fantome(resources, caseWidth, caseHeight, R.drawable.fantomerouge) {

    override fun spawnFantome() {
        // Initialise la position du fantôme vert dans le labyrinthe
        posX = 13 * caseWidth
        posY = 13 * caseHeight
    }
}