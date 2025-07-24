//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.testscript

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An abstract server representing a destination or receiver in a message exchange
 *
 * An abstract server used in operations within this test script in the destination element.
 *
 * @param id Unique id for inter-element referencing
 * @param index The index of the abstract destination server starting at 1
 * @param profile FHIR-Server | FHIR-SDC-FormManager | FHIR-SDC-FormReceiver |
 * FHIR-SDC-FormProcessor
 * @param url The url path of the destination server
 */
@SerialName("TestScriptDestination")
@Serializable
public data class TestScriptDestination(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The index of the abstract destination server starting at 1
   */
  public val index: Int? = null,
  /**
   * FHIR-Server | FHIR-SDC-FormManager | FHIR-SDC-FormReceiver | FHIR-SDC-FormProcessor
   */
  public val profile: Coding,
  /**
   * The url path of the destination server
   */
  public val url: String? = null,
) : BackboneElement
