/*
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

import io.ktor.client.features.contentnegatiation.tests.*
import io.ktor.common.serializaion.gson.*

class ClientGsonTest : ClientContentNegotiationTest() {
    override val converter = GsonConverter()
}