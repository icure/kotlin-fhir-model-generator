//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.clinicalusedefinition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifics for when this is a contraindication
 *
 * Specifics for when this is a contraindication.
 *
 * @param id Unique id for inter-element referencing
 * @param diseaseSymptomProcedure The situation that is being documented as contraindicating against
 * this item
 * @param diseaseStatus The status of the disease or symptom for the contraindication
 */
@SerialName("ClinicalUseDefinitionContraindication")
@Serializable
public data class ClinicalUseDefinitionContraindication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The situation that is being documented as contraindicating against this item
   */
  public val diseaseSymptomProcedure: CodeableReference? = null,
  /**
   * The status of the disease or symptom for the contraindication
   */
  public val diseaseStatus: CodeableReference? = null,
  public val comorbidity: List<CodeableReference> = emptyList(),
  public val indication: List<Reference> = emptyList(),
  public val otherTherapy: List<ClinicalUseDefinitionContraindicationOtherTherapy> = emptyList(),
) : BackboneElement
