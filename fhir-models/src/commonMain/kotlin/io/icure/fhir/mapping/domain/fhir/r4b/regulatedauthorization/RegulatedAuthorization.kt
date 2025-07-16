//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.regulatedauthorization

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Regulatory approval, clearance or licencing related to a regulated product, treatment, facility
 * or activity e.g. Market Authorization for a Medicinal Product
 *
 * Regulatory approval, clearance or licencing related to a regulated product, treatment, facility
 * or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market
 * Authorization relating to a Medicinal Product.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type Overall type of this authorization, for example drug marketing approval, orphan drug
 * designation
 * @param description General textual supporting information
 * @param status The status that is authorised e.g. approved. Intermediate states can be tracked
 * with cases and applications
 * @param statusDate The date at which the current status was assigned
 * @param validityPeriod The time period in which the regulatory approval etc. is in effect, e.g. a
 * Marketing Authorization includes the date of authorization and/or expiration date
 * @param indication Condition for which the use of the regulated product applies
 * @param intendedUse The intended use of the product, e.g. prevention, treatment
 * @param holder The organization that has been granted this authorization, by the regulator
 * @param regulator The regulatory authority or authorizing body granting the authorization
 * @param case The case or regulatory procedure for granting or amending a regulated authorization.
 * Note: This area is subject to ongoing review and the workgroup is seeking implementer feedback on
 * its use (see link at bottom of page)
 */
@SerialName("RegulatedAuthorization")
@Serializable
public data class RegulatedAuthorization(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  public val subject: List<Reference> = emptyList(),
  /**
   * Overall type of this authorization, for example drug marketing approval, orphan drug
   * designation
   */
  public val type: CodeableConcept? = null,
  /**
   * General textual supporting information
   */
  public val description: String? = null,
  public val region: List<CodeableConcept> = emptyList(),
  /**
   * The status that is authorised e.g. approved. Intermediate states can be tracked with cases and
   * applications
   */
  public val status: CodeableConcept? = null,
  /**
   * The date at which the current status was assigned
   */
  public val statusDate: String? = null,
  /**
   * The time period in which the regulatory approval etc. is in effect, e.g. a Marketing
   * Authorization includes the date of authorization and/or expiration date
   */
  public val validityPeriod: Period? = null,
  /**
   * Condition for which the use of the regulated product applies
   */
  public val indication: CodeableReference? = null,
  /**
   * The intended use of the product, e.g. prevention, treatment
   */
  public val intendedUse: CodeableConcept? = null,
  public val basis: List<CodeableConcept> = emptyList(),
  /**
   * The organization that has been granted this authorization, by the regulator
   */
  public val holder: Reference? = null,
  /**
   * The regulatory authority or authorizing body granting the authorization
   */
  public val regulator: Reference? = null,
  /**
   * The case or regulatory procedure for granting or amending a regulated authorization. Note: This
   * area is subject to ongoing review and the workgroup is seeking implementer feedback on its use
   * (see link at bottom of page)
   */
  public val case: RegulatedAuthorizationCase? = null,
) : DomainResource
