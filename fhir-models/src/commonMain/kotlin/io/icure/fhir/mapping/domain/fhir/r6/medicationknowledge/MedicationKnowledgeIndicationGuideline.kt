//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Guidelines or protocols for administration of the medication for an indication
 *
 * Guidelines or protocols that are applicable for the administration of the medication based on
 * indication.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("MedicationKnowledgeIndicationGuideline")
@Serializable
public data class MedicationKnowledgeIndicationGuideline(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val indication: List<CodeableReference> = emptyList(),
  public val dosingGuideline: List<MedicationKnowledgeIndicationGuidelineDosingGuideline> =
      emptyList(),
) : BackboneElement
