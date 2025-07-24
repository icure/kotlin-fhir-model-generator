//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
