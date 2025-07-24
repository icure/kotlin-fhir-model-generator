//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testscript

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An abstract server representing a client or sender in a message exchange
 *
 * An abstract server used in operations within this test script in the origin element.
 *
 * @param id Unique id for inter-element referencing
 * @param index The index of the abstract origin server starting at 1
 * @param profile FHIR-Client | FHIR-SDC-FormFiller
 * @param url The url path of the origin server
 */
@SerialName("TestScriptOrigin")
@Serializable
public data class TestScriptOrigin(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The index of the abstract origin server starting at 1
   */
  public val index: Int? = null,
  /**
   * FHIR-Client | FHIR-SDC-FormFiller
   */
  public val profile: Coding,
  /**
   * The url path of the origin server
   */
  public val url: String? = null,
) : BackboneElement
