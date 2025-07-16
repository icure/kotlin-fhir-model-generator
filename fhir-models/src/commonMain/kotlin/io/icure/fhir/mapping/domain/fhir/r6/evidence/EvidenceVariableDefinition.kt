//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.evidence

import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Evidence variable such as population, exposure, or outcome
 *
 * Evidence variable such as population, exposure, or outcome.
 *
 * @param id Unique id for inter-element referencing
 * @param description A text description or summary of the variable
 * @param variableRole population | exposure | outcome | covariate
 * @param roleSubtype subgroup | variable-A | variable-B | variable-AB | confounder | collider |
 * mediator | effect-modifier
 * @param comparatorCategory The reference value used for comparison
 * @param observed Definition of the actual variable related to the statistic(s)
 * @param intended Definition of the intended variable related to the Evidence
 * @param directnessMatch low | moderate | high | exact
 */
@SerialName("EvidenceVariableDefinition")
@Serializable
public data class EvidenceVariableDefinition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A text description or summary of the variable
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * population | exposure | outcome | covariate
   */
  public val variableRole: String? = null,
  /**
   * subgroup | variable-A | variable-B | variable-AB | confounder | collider | mediator |
   * effect-modifier
   */
  public val roleSubtype: CodeableConcept? = null,
  /**
   * The reference value used for comparison
   */
  public val comparatorCategory: String? = null,
  /**
   * Definition of the actual variable related to the statistic(s)
   */
  public val observed: Reference? = null,
  /**
   * Definition of the intended variable related to the Evidence
   */
  public val intended: Reference? = null,
  /**
   * low | moderate | high | exact
   */
  public val directnessMatch: CodeableConcept? = null,
) : BackboneElement
