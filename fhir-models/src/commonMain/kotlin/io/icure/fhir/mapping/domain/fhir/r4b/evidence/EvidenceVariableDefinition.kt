//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.evidence

import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param variableRole population | subpopulation | exposure | referenceExposure | measuredVariable
 * | confounder
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
   * population | subpopulation | exposure | referenceExposure | measuredVariable | confounder
   */
  public val variableRole: CodeableConcept,
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
