//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.regulatedauthorization

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The case or regulatory procedure for granting or amending a regulated authorization. Note: This
 * area is subject to ongoing review and the workgroup is seeking implementer feedback on its use (see
 * link at bottom of page)
 *
 * The case or regulatory procedure for granting or amending a regulated authorization. An
 * authorization is granted in response to submissions/applications by those seeking authorization. A
 * case is the administrative process that deals with the application(s) that relate to this and
 * assesses them. Note: This area is subject to ongoing review and the workgroup is seeking implementer
 * feedback on its use (see link at bottom of page).
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Identifier by which this case can be referenced
 * @param type The defining type of case
 * @param status The status associated with the case
 * @param datePeriod Relevant date for this case
 * @param dateDateTime Relevant date for this case
 */
@SerialName("RegulatedAuthorizationCase")
@Serializable
public data class RegulatedAuthorizationCase(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifier by which this case can be referenced
   */
  public val identifier: Identifier? = null,
  /**
   * The defining type of case
   */
  public val type: CodeableConcept? = null,
  /**
   * The status associated with the case
   */
  public val status: CodeableConcept? = null,
  /**
   * Relevant date for this case
   */
  public val datePeriod: Period? = null,
  /**
   * Relevant date for this case
   */
  public val dateDateTime: String? = null,
  public val application: List<RegulatedAuthorizationCase> = emptyList(),
) : BackboneElement
