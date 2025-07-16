//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.clinicalusedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param applicability An expression that returns true or false, indicating whether the indication
 * is applicable or not, after having applied its other elements
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
  /**
   * An expression that returns true or false, indicating whether the indication is applicable or
   * not, after having applied its other elements
   */
  public val applicability: Expression? = null,
  public val otherTherapy: List<ClinicalUseDefinitionContraindicationOtherTherapy> = emptyList(),
) : BackboneElement
