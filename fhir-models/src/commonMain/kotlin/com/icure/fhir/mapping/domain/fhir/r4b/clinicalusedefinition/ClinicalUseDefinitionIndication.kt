//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifics for when this is an indication
 *
 * Specifics for when this is an indication.
 *
 * @param id Unique id for inter-element referencing
 * @param diseaseSymptomProcedure The situation that is being documented as an indicaton for this
 * item
 * @param diseaseStatus The status of the disease or symptom for the indication
 * @param intendedEffect The intended effect, aim or strategy to be achieved
 * @param durationRange Timing or duration information
 * @param durationString Timing or duration information
 */
@SerialName("ClinicalUseDefinitionIndication")
@Serializable
public data class ClinicalUseDefinitionIndication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The situation that is being documented as an indicaton for this item
   */
  public val diseaseSymptomProcedure: CodeableReference? = null,
  /**
   * The status of the disease or symptom for the indication
   */
  public val diseaseStatus: CodeableReference? = null,
  public val comorbidity: List<CodeableReference> = emptyList(),
  /**
   * The intended effect, aim or strategy to be achieved
   */
  public val intendedEffect: CodeableReference? = null,
  /**
   * Timing or duration information
   */
  public val durationRange: Range? = null,
  /**
   * Timing or duration information
   */
  public val durationString: String? = null,
  public val undesirableEffect: List<Reference> = emptyList(),
  public val otherTherapy: List<ClinicalUseDefinitionContraindicationOtherTherapy> = emptyList(),
) : BackboneElement
