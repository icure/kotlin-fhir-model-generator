//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.composition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Attests to accuracy of composition
 *
 * A participant who has attested to the accuracy of the composition/document.
 *
 * @param id Unique id for inter-element referencing
 * @param mode personal | professional | legal | official
 * @param time When the composition was attested
 * @param party Who attested the composition
 */
@SerialName("CompositionAttester")
@Serializable
public data class CompositionAttester(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * personal | professional | legal | official
   */
  public val mode: CodeableConcept,
  /**
   * When the composition was attested
   */
  public val time: String? = null,
  /**
   * Who attested the composition
   */
  public val party: Reference? = null,
) : BackboneElement
