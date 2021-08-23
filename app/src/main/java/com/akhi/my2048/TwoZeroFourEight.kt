package com.akhi.my2048

import com.akhi.my2048.game.engine.GameEngine
import com.akhi.my2048.game.engine.GameEngineProtocol
import java.util.*

/**
 * Created by steve on 17/10/16.
 * Grid is from bottom left to right, bottom to top.
 */
class TwoZeroFourEight(delegated: GameEngineProtocol) : GameEngine(delegate = delegated) {

    lateinit var startedPlaying : Date
        private set
    lateinit var startLastGame : Date
        private set

    init {
        this.startedPlaying = Date()
        this.startLastGame = this.startedPlaying
    }

    override fun newGame(newHighScore: Int) {
        super.newGame(newHighScore)
        this.startLastGame = Date()
    }

    fun getTotalTimePlaying() = (Date().time - startedPlaying.time)
    fun getTimePlayingCurrent() = (Date().time - startLastGame.time)
}