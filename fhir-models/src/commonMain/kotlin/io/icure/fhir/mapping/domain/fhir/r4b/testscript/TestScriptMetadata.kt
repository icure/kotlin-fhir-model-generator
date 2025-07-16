//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.testscript

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Required capability that is assumed to function correctly on the FHIR server being tested
 *
 * The required capability must exist and are assumed to function correctly on the FHIR server being
 * tested.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("TestScriptMetadata")
@Serializable
public data class TestScriptMetadata(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val link: List<TestScriptMetadataLink> = emptyList(),
  public val capability: List<TestScriptMetadataCapability> = emptyList(),
) : BackboneElement
