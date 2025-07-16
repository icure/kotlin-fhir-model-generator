//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.specimen

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The physical feature of a specimen
 *
 * A physical feature or landmark on a specimen, highlighted for context by the collector of the
 * specimen (e.g. surgeon), that identifies the type of feature as well as its meaning (e.g. the red
 * ink indicating the resection margin of the right lobe of the excised prostate tissue or wire loop at
 * radiologically suspected tumor location).
 *
 * @param id Unique id for inter-element referencing
 * @param type Highlighted feature
 * @param description Information about the feature
 */
@SerialName("SpecimenFeature")
@Serializable
public data class SpecimenFeature(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Highlighted feature
   */
  public val type: CodeableConcept,
  /**
   * Information about the feature
   */
  public val description: String? = null,
) : BackboneElement
