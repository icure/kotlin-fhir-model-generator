//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.testscript

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Links to the FHIR specification
 *
 * A link to the FHIR specification that this test is covering.
 *
 * @param id Unique id for inter-element referencing
 * @param url URL to the specification
 * @param description Short description
 */
@SerialName("TestScriptMetadataLink")
@Serializable
public data class TestScriptMetadataLink(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * URL to the specification
   */
  public val url: String? = null,
  /**
   * Short description
   */
  public val description: String? = null,
) : BackboneElement
