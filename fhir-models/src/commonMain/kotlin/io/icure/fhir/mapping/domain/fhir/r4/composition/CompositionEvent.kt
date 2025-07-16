//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.composition

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The clinical service(s) being documented
 *
 * The clinical service, such as a colonoscopy or an appendectomy, being documented.
 *
 * @param id Unique id for inter-element referencing
 * @param period The period covered by the documentation
 */
@SerialName("CompositionEvent")
@Serializable
public data class CompositionEvent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  /**
   * The period covered by the documentation
   */
  public val period: Period? = null,
  public val detail: List<Reference> = emptyList(),
) : BackboneElement
