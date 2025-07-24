//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.testscript

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Capabilities  that are assumed to function correctly on the FHIR server being tested
 *
 * Capabilities that must exist and are assumed to function correctly on the FHIR server being
 * tested.
 *
 * @param id Unique id for inter-element referencing
 * @param required Are the capabilities required?
 * @param validated Are the capabilities validated?
 * @param description The expected capabilities of the server
 * @param destination Which server these requirements apply to
 * @param capabilities Required Capability Statement
 */
@SerialName("TestScriptMetadataCapability")
@Serializable
public data class TestScriptMetadataCapability(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Are the capabilities required?
   */
  public val required: Boolean? = null,
  /**
   * Are the capabilities validated?
   */
  public val validated: Boolean? = null,
  /**
   * The expected capabilities of the server
   */
  public val description: String? = null,
  public val origin: List<Int> = emptyList(),
  /**
   * Which server these requirements apply to
   */
  public val destination: Int? = null,
  public val link: List<String> = emptyList(),
  /**
   * Required Capability Statement
   */
  public val capabilities: String? = null,
) : BackboneElement
