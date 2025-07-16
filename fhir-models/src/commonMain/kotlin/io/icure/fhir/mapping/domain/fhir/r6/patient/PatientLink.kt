//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.patient

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Link to a Patient or RelatedPerson resource that concerns the same actual individual
 *
 * Link to a Patient or RelatedPerson resource that concerns the same actual individual.
 *
 * @param id Unique id for inter-element referencing
 * @param other The other patient or related person resource that the link refers to
 * @param type replaced-by | replaces | refer | seealso
 */
@SerialName("PatientLink")
@Serializable
public data class PatientLink(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The other patient or related person resource that the link refers to
   */
  public val other: Reference,
  /**
   * replaced-by | replaces | refer | seealso
   */
  public val type: String? = null,
) : BackboneElement
