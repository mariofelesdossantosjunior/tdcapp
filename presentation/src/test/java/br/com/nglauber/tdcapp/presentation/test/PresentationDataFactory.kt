package br.com.nglauber.tdcapp.test

import br.com.nglauber.tdcapp.presentation.model.*
import br.com.nglauber.tdcapp.presentation.test.DataFactory

object PresentationDataFactory {
    fun makeEvent() = EventBiding(
            DataFactory.randomLong(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomBoolean(),
            DataFactory.randomBoolean(),
            DataFactory.randomInt(),
            DataFactory.randomBoolean(),
            DataFactory.randomDateAsString(),
            DataFactory.randomDateAsString()
    )

    fun makeEventsList(count: Int): List<EventBiding> {
        val events = mutableListOf<EventBiding>()
        repeat(count) {
            events.add(makeEvent())
        }
        return events
    }

    fun makeModality() = ModalityBinding(
            DataFactory.randomLong(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomBoolean(),
            DataFactory.randomInt(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomBoolean(),
            DataFactory.randomDateAsString()
    )

    fun makeModalitiesList(count: Int): List<ModalityBinding> {
        val modalities = mutableListOf<ModalityBinding>()
        repeat(count) {
            modalities.add(makeModality())
        }
        return modalities
    }

    fun makeSession() = SessionBinding(
            DataFactory.randomLong(),
            DataFactory.randomInt(),
            DataFactory.randomInt(),
            DataFactory.randomBoolean(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomInt(),
            DataFactory.randomString(),
            DataFactory.randomLong(),
            DataFactory.randomLong(),
            DataFactory.randomBoolean()
    )

    fun makeSessionsList(count: Int): List<SessionBinding> {
        val sessions = mutableListOf<SessionBinding>()
        repeat(count) {
            sessions.add(makeSession())
        }
        return sessions
    }

    fun makeMember() = MemberBinding(
            DataFactory.randomInt(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString()
    )

    fun makeMiniBio() = MiniBioBinding(
            DataFactory.randomInt(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString(),
            DataFactory.randomString()
    )

    fun makeSpeaker() = SpeakerBinding(
            DataFactory.randomLong(),
            makeMember(),
            makeMiniBio()
    )

    fun makeSpeakersList(count: Int): List<SpeakerBinding> {
        val speakers = mutableListOf<SpeakerBinding>()
        repeat(count) {
            speakers.add(makeSpeaker())
        }
        return speakers
    }
}